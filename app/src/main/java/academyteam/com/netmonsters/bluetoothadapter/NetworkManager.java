package academyteam.com.netmonsters.bluetoothadapter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/**
 * Created by mbarnard on 24/07/2015.
 */
public class NetworkManager {

    public static String NAME = "BluetoothUser";
    public static java.util.UUID UUID = null;
    public static boolean isServer = false;

    private Context mActiveContext;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothSocket mBluetoothSocket;

    private Thread mNetworkThread;
    private Handler mHandler;
    private ProcessMessagesThread mMessageThread;

    private BluetoothDevice mConnectedDevice;

    public NetworkManager(Context activeContext, BluetoothAdapter bluetoothAdapter) {

        mActiveContext = activeContext;
        mBluetoothAdapter = bluetoothAdapter;
        mBluetoothSocket = null;

        UUID = UUID.fromString("3831778f-0f39-4524-8dac-c23ee6c6cff7");

        mNetworkThread = new ProcessMessagesThread(mHandler, mBluetoothSocket);

    }

    public void addConnectedDevice(BluetoothDevice bluetoothDevice) {

        mConnectedDevice = bluetoothDevice;
    }

    public void waitForConnection() {

        Handler handler = new Handler() {

            @Override
            public void handleMessage(Message msg) {

                String message = msg.getData().getString("Message");

                if (message == "Connection Established") {
                    startMessageProcessing();
                }
            }
        };

        Intent discoverableIntent = new
                Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
        mActiveContext.startActivity(discoverableIntent);

        // Initialise the message receiver thread.
        mNetworkThread = new AcceptThread(handler, mBluetoothAdapter, mBluetoothSocket);
        mNetworkThread.start();
    }

    public void connectToDevice() {

        Handler handler = new Handler() {

            @Override
            public void handleMessage(Message msg) {

                String message = msg.getData().getString("Message");

                if (message == "Connection Established") {
                    startMessageProcessing();
                }
            }
        };

        mBluetoothAdapter.startDiscovery();

        // Initialise the message connection thread.
        mNetworkThread = new ConnectThread(handler, mBluetoothAdapter, mBluetoothSocket, mConnectedDevice);
        mNetworkThread.start();
    }

    private void startMessageProcessing() {

        System.out.println("IT WORKS!");

        Handler handler = new Handler() {

            @Override
            public void handleMessage(Message msg) {
                System.out.println(msg.getData().getString("Message"));
            }
        };

        mNetworkThread = new ProcessMessagesThread(handler, mBluetoothSocket);
        mNetworkThread.start();
    }
}
