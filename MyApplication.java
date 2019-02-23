package com.estimote.proximity;

import android.app.Application;

import com.estimote.proximity_sdk.api.EstimoteCloudCredentials;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    public EstimoteCloudCredentials cloudCredentials =
            new EstimoteCloudCredentials("proximity-single-beacon-9fg", "371fe6dff1a77245337f3f2f47db6e04");
}
