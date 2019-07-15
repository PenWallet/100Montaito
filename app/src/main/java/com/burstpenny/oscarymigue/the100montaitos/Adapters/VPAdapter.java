package com.burstpenny.oscarymigue.the100montaitos.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.burstpenny.oscarymigue.the100montaitos.Database;



public class VPAdapter extends PagerAdapter {
    private Context context;

    public VPAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Database.personas.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }
}
