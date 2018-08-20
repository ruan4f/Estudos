package com.example.ruan.exemplovimeo.vimeonetworking;

import android.Manifest.permission;
import android.accounts.AccountManager;
import android.content.Context;
import android.support.annotation.RequiresPermission;

import com.example.ruan.exemplovimeo.AccountPreferenceManager;
import com.example.ruan.exemplovimeo.TestApp;
import com.vimeo.networking.AccountStore;
import com.vimeo.networking.VimeoClient;
import com.vimeo.networking.model.VimeoAccount;

/**
 * Created by Ruan on 21/03/2017.
 */

public class TestAccountStore implements AccountStore {

    private AccountManager mAccountManager;

    @RequiresPermission(permission.GET_ACCOUNTS)
    public TestAccountStore(Context context) {
        if (context == null || !(context instanceof TestApp)) {
            throw new AssertionError("context and vimeoApp must not be null");
        }

        // NOTE: You can use the account manager in the below methods to hook into the Android Accounts
//        mAccountManager = AccountManager.get(context);
    }

    @Override
    public VimeoAccount loadAccount() {
        return AccountPreferenceManager.getClientAccount();
    }

    @Deprecated
    @Override
    public void saveAccount(VimeoAccount vimeoAccount, String email, String password) {
        saveAccount(vimeoAccount, email);
    }

    @Override
    public void saveAccount(VimeoAccount vimeoAccount, String email) {
        AccountPreferenceManager.setClientAccount(vimeoAccount);
    }

    @Override
    public void deleteAccount(VimeoAccount vimeoAccount) {
        AccountPreferenceManager.removeClientAccount();
        // NOTE: You'll now need a client credentials grant (without an authenticated user)
    }

    public void updateAccount(VimeoAccount vimeoAccount) {
        AccountPreferenceManager.setClientAccount(vimeoAccount);
        VimeoClient.getInstance().setVimeoAccount(vimeoAccount);
    }
}
