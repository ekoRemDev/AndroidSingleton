<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:minHeight="?attr/listPreferredItemHeight"
              android:gravity="center_vertical"
              android:padding="16dp"
              android:background="?attr/selectableItemBackground"
              android:orientation="vertical"
    >

  <TextView
      android:id="@android:id/title"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:singleLine="true"
      android:textAppearance="@style/TextAppearance.AppCompat.Medium"
      android:textSize="16sp"
      android:ellipsize="marquee"
      android:fadingEdge="horizontal"
      />

  <TextView
      android:id="@android:id/summary"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:textAppearance="@style/TextAppearance.AppCompat.Small"
      android:textColor="?android:attr/textColorSecondary"
      android:maxLines="4"
      />

  <LinearLayout
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:orientation="horizontal"
      >

    <SeekBar
        android:id="@+id/seekbar"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:layout_gravity="center_vertical"
        />

    <TextView
        android:id="@+id/value"
        android:layout_width="36dp"
        android:layout_height="wrap_content"
        android:layout_gravity="center_vertical"
        />
  </LinearLayout>

  <LinearLayout
      android:id="@android:id/widget_frame"
      android:layout_width="wrap_content"
      android:layout_height="match_parent"
      android:gravity="center_vertical"
      android:orientation="vertical"
      />

</LinearLayout>
                                                                                                                                                                                                                                                                                                                  