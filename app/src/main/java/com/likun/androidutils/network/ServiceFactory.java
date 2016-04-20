package com.likun.androidutils.network;

import com.likun.androidutils.config.Constants;

/**
 * Created by likun on 16/4/19.
 */
public class ServiceFactory {


    private static TestService mService;

    public static TestService getMainIns(){
        if (mService == null){
            mService = HttpClient.getIns(Constants.BASE_URL).createService(TestService.class);
        }
        return mService;
    }
}
