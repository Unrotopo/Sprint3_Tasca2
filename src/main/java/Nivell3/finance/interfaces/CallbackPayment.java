package Nivell3.finance.interfaces;

public interface CallbackPayment {
    void onSuccess(String message);
    void onFailure(Exception e);
}
