package com.orogersilva.dbflowtraining.model;

import com.orogersilva.dbflowtraining.vo.Friend;

/**
 * Created by orogersilva on 3/12/2016.
 */
public class FriendModel {

    // region CRUD

    public void create(Friend newFriend) {

        if (newFriend == null) {
            throw new IllegalArgumentException();
        }

        newFriend.save();
    }

    // endregion
}
