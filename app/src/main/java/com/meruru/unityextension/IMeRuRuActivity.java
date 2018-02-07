package com.meruru.unityextension;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by wfz on 2018/1/25.
 */

public interface IMeRuRuActivity {


    public abstract void onCreate(Bundle savedInstanceState);


    public abstract void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);


    public abstract void onActivityResult(int requestCode, int resultCode, Intent data);
}
