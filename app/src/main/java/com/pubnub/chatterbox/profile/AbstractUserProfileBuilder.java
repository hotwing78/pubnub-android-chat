package com.pubnub.chatterbox.profile;

import com.google.android.gms.common.api.GoogleApiClient;
import com.pubnub.chatterbox.domain.ChatterBoxUserProfile;

public abstract class AbstractUserProfileBuilder {

    public static AbstractUserProfileBuilder getInstance(Object o) {
        if (o instanceof GoogleApiClient) {
            GPlusUserProfileBuilder gbuilder = new GPlusUserProfileBuilder();
            gbuilder.setGoogleApiClient((GoogleApiClient) o);
            return gbuilder;
        }//else if(o instanceof) Facebook, Twitter,LinkedIn, OpenID, Custom

        //}

        //NOTE: Could throw an exception here.
        return null;
    }

    public abstract ChatterBoxUserProfile build();


}
