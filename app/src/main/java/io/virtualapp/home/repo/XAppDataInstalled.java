package io.virtualapp.home.repo;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.lody.virtual.server.pm.parser.VPackage;

import io.virtualapp.R;
import io.virtualapp.home.HomeActivity;
import io.virtualapp.home.models.AppData;

public class XAppDataInstalled implements AppData
{
    public String pkgName = "";
    @Override
    public boolean isLoading()
    {
        return false;
    }

    @Override
    public boolean isFirstOpen()
    {
        return false;
    }

    @Override
    public Drawable getIcon()
    {
        return ContextCompat.getDrawable(HomeActivity.hHomeAct, R.mipmap.ic_launcher);
    }

    @Override
    public String getName()
    {
        return pkgName;
    }

    @Override
    public String getPackageName()
    {
        return pkgName;
    }

    @Override
    public String versionName()
    {
        return "1.0";
    }

    @Override
    public boolean canReorder()
    {
        return true;
    }

    @Override
    public boolean canLaunch()
    {
        return true;
    }

    @Override
    public boolean canDelete()
    {
        return true;
    }

    @Override
    public boolean canCreateShortcut()
    {
        return true;
    }

    @Override
    public VPackage.XposedModule getXposedModule()
    {
        return null;
    }
}
