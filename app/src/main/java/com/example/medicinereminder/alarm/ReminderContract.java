package com.example.medicinereminder.alarm;

import com.example.medicinereminder.BasePresenter;
import com.example.medicinereminder.BaseView;
import com.example.medicinereminder.source.History;
import com.example.medicinereminder.source.MedicineAlarm;

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
