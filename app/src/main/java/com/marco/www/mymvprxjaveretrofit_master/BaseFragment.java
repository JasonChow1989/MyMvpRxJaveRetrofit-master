package com.marco.www.mymvprxjaveretrofit_master;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marco.www.mymvprxjaveretrofit_master.ui.view.MvpView;

public abstract class BaseFragment extends Fragment implements MvpView
{
    public Activity context;
    public View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(getLayoutResource(), container, false);
        }
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        initView();
        initData();
        super.onActivityCreated(savedInstanceState);
    }

    protected abstract int getLayoutResource();

    protected abstract void initData();

    protected abstract void initView();

    @Override
    public void onAttach(Activity activity) {
        this.context = activity;
        super.onAttach(activity);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    public void onResume() {
        super.onResume();
    }
    public void onPause() {
        super.onPause();
    }

    @Override
    public void showLoading(String msg)
    {

    }

    @Override
    public void hideLoading()
    {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener)
    {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener)
    {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId)
    {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener)
    {

    }
}
