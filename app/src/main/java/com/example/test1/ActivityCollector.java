package com.example.test1;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 廖坤雄 on 2017/8/12.
 */

public class ActivityCollector {
    static List<Activity> list = new ArrayList<Activity>();

    //添加活动
    public static void addActivity(Activity activity){
        list.add(activity);
    }
    //移除活动
    public static void removeActivity(Activity activity){
        list.remove(activity);
    }
    //销毁全部活动，即退出程序
    public static void finishAll(){
        for(Activity activity:list){
            if(!activity.isFinishing()){   //如果选中的活动未销毁，则进行销毁
                activity.finish();
            }
        }
    }
}
