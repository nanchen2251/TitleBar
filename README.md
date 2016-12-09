# TitleBar
#一个可让你随意设置的标题栏，欢迎各位拍砖，主要是实现简单
##效果图<br>
![](https://github.com/nanchen2251/TitleBar/blob/master/photo1.jpg)
![](https://github.com/nanchen2251/TitleBar/blob/master/photo3.jpg) 
![](https://github.com/nanchen2251/TitleBar/blob/master/photo2.jpg)<br>
####⊙开源不易，希望给个star或者fork奖励
##特点
  1、支持直接点击左侧关闭当前页面<br>
  2、支持点击效果<br>
  3、支持设置文字，特殊字体和图片按钮<br>
  4、支持更改颜色，设置任意按钮的样式<br>
##使用方法
####1、添加依赖<br>
```java
  compile 'com.nanchen.titlebar:titlebar:1.0.1'
```
  或者<br>
  ```java
<dependency>
  <groupId>com.nanchen.titlebar</groupId>
  <artifactId>titlebar</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
####2、在manifests里面设置不要标题
```java
android:theme="@style/Theme.AppCompat.DayNight.NoActionBar"
```
####3、在xml文件里面使用<br>
```java
  <com.nanchen.titlebar.TitleView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/titleBar"/>
```
####4、在Activity里面使用<br>各种使用效果请下载使用
```java
   mTitleBar = (TitleView) findViewById(R.id.titleBar);
        //设置左侧按钮点击关闭Activity
        mTitleBar.setLeftButtonAsFinish(this);
        //设置标题栏中间文字
        mTitleBar.setTitle("测试");
        //设置左侧图片
//        mTitleBar.setLeftButtonImage(R.mipmap.ic_launcher);
        //设置左侧点击事件
//        mTitleBar.setLeftButtonOnClickListener(new OnClickListener());
        //设置中间是一个view
//        mTitleBar.setCenterButtonAsCustomView(view);
        //设置是否显示下方下划线
//        mTitleBar.showBottomLine(true);

        // 设置右侧文字
        mTitleBar.setRightButtonText("\ue620");
        //设置右侧图片
//        mTitleBar.setRightButtonImage(R.mipmap.ic_launcher);
        //设置文本大小
        mTitleBar.setRightButtonTextSize(25);
        mTitleBar.setFixRightButtonPadingTop();
        //设置右侧点击监听
        mTitleBar.setRightButtonOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this.getApplicationContext(),"你点击了右侧按钮",Toast.LENGTH_SHORT).show();
            }
        });
```
##关于作者
    南尘<br>
    四川成都<br>
    [博客园](http://www.cnblogs.com/liushilin/)
