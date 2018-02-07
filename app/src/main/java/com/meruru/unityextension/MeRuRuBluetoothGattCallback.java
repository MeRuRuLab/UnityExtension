package com.meruru.unityextension;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;

/**
 * Created by wfz on 2018/1/25.
 */

public class MeRuRuBluetoothGattCallback extends BluetoothGattCallback {

   private IBluetoothGattCallback IBGC;

   public void AddUnityCallBack (IBluetoothGattCallback ibgc)
   {
       if (ibgc!=null)
       {
           IBGC=ibgc;
       }
   }

    @Override
    public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
        super.onCharacteristicChanged(gatt, characteristic);

        if (IBGC!=null)
        {
            IBGC.onCharacteristicChanged(gatt,characteristic);
        }
        else
        {
            Log.w("MeRuRu", "onCharacteristicChanged is null for Unity." );
        }
    }

    @Override
    public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        super.onCharacteristicRead(gatt, characteristic, status);
        if (IBGC!=null)
        {
            IBGC.onCharacteristicRead(gatt,characteristic,status);
        }
        else
        {
            Log.w("MeRuRu", "onCharacteristicRead is null for Unity." );
        }
    }

    @Override
    public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        super.onCharacteristicWrite(gatt, characteristic, status);
        if (IBGC!=null)
        {
            IBGC.onCharacteristicWrite(gatt,characteristic,status);
        }
        else
        {
            Log.w("MeRuRu", "onCharacteristicWrite is null for Unity." );
        }
    }

    @Override
    public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
        super.onConnectionStateChange(gatt, status, newState);
        if (IBGC!=null)
        {
            IBGC.onConnectionStateChange(gatt,status,newState);
        }
        else
        {
            Log.w("MeRuRu", "onCharacteristicWrite is null for Unity." );
        }
    }

    @Override
    public void onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
        super.onDescriptorRead(gatt, descriptor, status);
        if (IBGC!=null)
        {
            IBGC.onDescriptorRead(gatt,descriptor,status);
        }
        else
        {
            Log.w("MeRuRu", "onDescriptorRead is null for Unity." );
        }
    }

    @Override
    public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
        super.onDescriptorWrite(gatt, descriptor, status);
        if (IBGC!=null)
        {
            IBGC.onDescriptorWrite(gatt,descriptor,status);
        }
        else
        {
            Log.w("MeRuRu", "onDescriptorWrite is null for Unity." );
        }
    }

    @Override
    public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
        super.onMtuChanged(gatt, mtu, status);
        if (IBGC!=null)
        {
            IBGC.onMtuChanged(gatt,mtu,status);
        }
        else
        {
            Log.w("MeRuRu", "onMtuChanged is null for Unity." );
        }
    }

    @Override
    public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) {
        super.onReadRemoteRssi(gatt, rssi, status);
        if (IBGC!=null)
        {
            IBGC.onReadRemoteRssi(gatt,rssi,status);
        }
        else
        {
            Log.w("MeRuRu", "onReadRemoteRssi is null for Unity." );
        }
    }

    @Override
    public void onReliableWriteCompleted(BluetoothGatt gatt, int status) {
        super.onReliableWriteCompleted(gatt, status);
        if (IBGC!=null)
        {
            IBGC.onReliableWriteCompleted(gatt,status);
        }
        else
        {
            Log.w("MeRuRu", "onReliableWriteCompleted is null for Unity." );
        }
    }

    @Override
    public void onServicesDiscovered(BluetoothGatt gatt, int status) {
        super.onServicesDiscovered(gatt, status);
        if (IBGC!=null)
        {
            IBGC.onServicesDiscovered(gatt,status);
        }
        else
        {
            Log.w("MeRuRu", "onServicesDiscovered is null for Unity." );
        }
    }

}
