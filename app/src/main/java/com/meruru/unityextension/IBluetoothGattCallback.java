package com.meruru.unityextension;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/**
 * Created by wfz on 2018/1/25.
 */

public interface IBluetoothGattCallback {

    public abstract void	onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic);
    public abstract void	onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);
    public abstract void	onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);
    public abstract void	onConnectionStateChange(BluetoothGatt gatt, int status, int newState);
    public abstract void	onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status);
    public abstract void	onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status);
    public abstract void	onMtuChanged(BluetoothGatt gatt, int mtu, int status);
    public abstract void	onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status);
    public abstract void	onReliableWriteCompleted(BluetoothGatt gatt, int status);
    public abstract void	onServicesDiscovered(BluetoothGatt gatt, int status);
}
