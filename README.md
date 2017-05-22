# ZProgressBar
一个可动态配置颜色、弧度，带动画的自定义 ProgressBar

## 预览
![](https://github.com/Airsaid/ZProgressBar/blob/master/preview/preview.gif)  

## 使用
XML 中：
```
 <com.github.airsaid.zprogressbar.widget.ZProgressBar
        android:id="@+id/progressBar"
        android:layout_width="match_parent"
        android:layout_height="20dp"
        android:max="100"
        app:zpb_backgroundColor="#999999"
        app:zpb_duration="300"
        app:zpb_progressColor="@color/colorAccent"
        app:zpb_radius="16dp"/>
```
代码中：
```
ZProgressBar mProgressBar = (ZProgressBar) findViewById(R.id.progressBar);
mProgressBar.setAnimProgress(50);
```


## 属性&方法

| 属性名|java方法| 作用 |
|------------|-----------|--------|
| zpb_backgroundColor| setDefBackgroundColor(int color)|设置背景颜色 |
| zpb_progressColor| setProgressColor(int color)|设置进度颜色 |
| zpb_radius| setRadius(float radius)|设置背景弧度 |
| zpb_duration| setDuration(int duration)|设置动画时长 |

## 联系我

- **QQ 群：** 5707887
- **Blog：**[http://blog.csdn.net/airsaid](http://blog.csdn.net/airsaid)
- **Email：** airsaid1024@gmail.com
