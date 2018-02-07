package com.meruru.unityextension;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MeRuRuActivity extends UnityPlayerActivity {
    Bitmap
    private IMeRuRuActivity IMRRA;
    public void AddUnityCallBack(IMeRuRuActivity imrra)
    {
        if(imrra!=null)
        {
            IMRRA=imrra;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (IMRRA!=null)
        {
            IMRRA.onCreate(savedInstanceState);
        }
        else
        {
            Log.w("MeRuRu", "onCreate is null for Unity. ");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (IMRRA!=null)
        {
            IMRRA.onRequestPermissionsResult(requestCode,permissions,grantResults);
        }
        else
        {
            Log.w("MeRuRu", "onRequestPermissionsResult is null for Unity. ");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (IMRRA!=null)
        {
            IMRRA.onActivityResult(requestCode,resultCode,data);
        }
        else
        {
            Log.w("MeRuRu", "onActivityResult is null for Unity. ");
        }
    }
}
