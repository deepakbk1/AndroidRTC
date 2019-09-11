package com.deepak.androidrtc.call;

/**
 * Call control interface for container activity.
 */
public interface OnCallEvents {
    void onCallHangUp();

    void onCameraSwitch();

    void onCaptureFormatChange(int width, int height, int framerate);

    boolean onToggleMic();
}