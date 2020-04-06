package activity;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

import io.flutter.Log;
import io.flutter.app.FlutterActivity;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;

public class TestLibraryActivity extends FlutterActivity implements LifecycleOwner {

    private final String TAG = "TestLibraryActivity";
    private LifecycleRegistry mLifecycleRegistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate--->");
        mLifecycleRegistry = new LifecycleRegistry(this);
        mLifecycleRegistry.markState(Lifecycle.State.CREATED);
    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return mLifecycleRegistry;
    }

    @Override
    public FlutterView createFlutterView(Context context) {
        Log.e(TAG,"createFlutterView--->");
        WindowManager.LayoutParams matchParent = new WindowManager.LayoutParams(-1, -1);
        FlutterNativeView nativeView = this.createFlutterNativeView();
        FlutterView flutterView = new FlutterView(this,  null, nativeView);
        flutterView.setInitialRoute("sign");
        flutterView.setLayoutParams(matchParent);
        setContentView(flutterView);
        return flutterView;
    }


    @Override
    public FlutterNativeView createFlutterNativeView() {
        return null;
    }
}
