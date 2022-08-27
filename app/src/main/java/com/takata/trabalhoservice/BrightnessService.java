package com.takata.trabalhoservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BrightnessService extends Service {
    public BrightnessService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}