package com.meruru.unityextension;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.util.Log;

import java.util.List;

/**
 * Created by wfz on 2018/1/25.
 */

public class MeRuRuScanCallback extends ScanCallback {

    private IScanCallback ISC;

    public void AddUnityCallBack (IScanCallback isc)
    {
        if (isc!=null)
        {
            ISC=isc;
        }
    }
    @Override
    public void onBatchScanResults(List<ScanResult> results) {
        super.onBatchScanResults(results);
        if (ISC!=null)
        {
            ISC.onBatchScanResults(results);
        }
        else
        {
            Log.w("MeRuRu", "onBatchScanResults is null for Unity." );
        }
    }

    @Override
    public void onScanFailed(int errorCode) {
        super.onScanFailed(errorCode);
        if (ISC!=null)
        {
            ISC.onScanFailed(errorCode);
        }
        else
        {
            Log.w("MeRuRu", "onScanFailed is null for Unity." );
        }
    }

    @Override
    public void onScanResult(int callbackType, ScanResult result) {
        super.onScanResult(callbackType, result);

        if (ISC!=null)
        {
            ISC.onScanResult(callbackType,result);
        }
        else
        {
            Log.w("MeRuRu", "onScanResult is null for Unity." );
        }
    }

}
