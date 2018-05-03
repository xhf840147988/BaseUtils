package com.example.avazuholding.base;

import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * Created by xhf on 2018/5/3
 */
public class BottomDialog extends BaseDialog {

    private FragmentManager mFragmentManager;

    private float mDimAmount = super.getDimAmount();

    @LayoutRes
    private int mLayoutRes;

    private int mGravity;

    private ViewListener mViewListener;


    public static BottomDialog create(FragmentManager manager) {
        BottomDialog dialog = new BottomDialog();
        dialog.setFragmentManager(manager);
        return dialog;
    }

    @Override
    public int getLayoutRes() {
        return mLayoutRes;
    }

    @Override
    public int getGravity() {
        return mGravity;
    }

    @Override
    public void bindView(View v) {
        if (mViewListener != null) {
            mViewListener.bindView(v);
        }
    }

    public BottomDialog setFragmentManager(FragmentManager manager) {
        mFragmentManager = manager;
        return this;
    }

    public BottomDialog setViewListener(ViewListener listener) {
        mViewListener = listener;
        return this;
    }

    public BottomDialog setLayoutRes(@LayoutRes int layoutRes) {
        mLayoutRes = layoutRes;
        return this;
    }


    public BottomDialog setDimAmount(float dim) {
        mDimAmount = dim;
        return this;
    }

    public BottomDialog setViewGravity(int gravity) {
        mGravity = gravity;
        return this;
    }


    @Override
    public float getDimAmount() {
        return mDimAmount;
    }


    public interface ViewListener {
        void bindView(View v);
    }

    public BaseDialog show() {
        show(mFragmentManager);
        return this;
    }
}
