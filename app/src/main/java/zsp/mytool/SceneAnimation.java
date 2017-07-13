package zsp.mytool;

/**
 * Created by Administrator on 2017/3/25 0025.
 */

import android.widget.ImageView;

import java.util.List;

public class SceneAnimation {
    private ImageView mImageView;
    private List<Integer> mFrameRess;
//    private int[] mDurations;
    private int mDuration;

    private int mLastFrameNo;
    private long mBreakDelay;

//    public SceneAnimation(ImageView pImageView, List<Integer> pFrameRess,
//                          int[] pDurations) {
//        mImageView = pImageView;
//        mFrameRess = pFrameRess;
//        mDurations = pDurations;
//        mLastFrameNo = pFrameRess.size() - 1;
//
//        mImageView.setBackgroundResource(mFrameRess.get(0));
//        play(1);
//    }

    public SceneAnimation(ImageView pImageView,List<Integer> pFrameRess, int pDuration) {
        mImageView = pImageView;
        mFrameRess = pFrameRess;
        mDuration = pDuration;
        mLastFrameNo = pFrameRess.size() - 1;

        mImageView.setBackgroundResource(mFrameRess.get(0));
        playConstant(1);
    }

    public SceneAnimation(ImageView pImageView, List<Integer> pFrameRess,
                          int pDuration, long pBreakDelay) {
        mImageView = pImageView;
        mFrameRess = pFrameRess;
        mDuration = pDuration;
        mLastFrameNo = pFrameRess.size() - 1;
        mBreakDelay = pBreakDelay;

        mImageView.setBackgroundResource(mFrameRess.get(0));
        playConstant(1);
    }

//    private void play(final int pFrameNo) {
//        mImageView.postDelayed(new Runnable() {
//            public void run() {
//                mImageView.setBackgroundResource(mFrameRess.get(pFrameNo));
//                if (pFrameNo == mLastFrameNo)
//                    play(0);
//                else
//                    play(pFrameNo + 1);
//            }
//        }, mDurations[pFrameNo]);
//    }

    private void playConstant(final int pFrameNo) {
        mImageView.postDelayed(new Runnable() {
            public void run() {
                mImageView.setBackgroundResource(mFrameRess.get(pFrameNo));

                if (pFrameNo == mLastFrameNo)
                    playConstant(0);
                else
                    playConstant(pFrameNo + 1);
            }
        }, pFrameNo == mLastFrameNo && mBreakDelay > 0 ? mBreakDelay
                : mDuration);
    }
}