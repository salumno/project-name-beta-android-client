package com.example.aroundapplcation.contracts;

import android.net.Uri;

import com.example.aroundapplcation.model.BusinessCard;

public interface ProfileContract {
    interface View {

        void updateBusinessCardFields(final BusinessCard businessCard);

        void updateIconByMemoryImage(final Uri currentIconUri);

        void showToast(final String message);

        void updateIconByLoadedImage(final String iconUri);
    }

    interface Presenter {
        void initAccessToken();

        void initBusinessCard();

        void updateBusinessCard();

        void savePhoneNumber(final String phone);

        void saveName(final String name);

        void saveSurname(final String surname);

        void saveVk(final String vkId);

        void saveInstagram(final String instagramId);

        void saveIconPath(final Uri iconUri);
    }
}
