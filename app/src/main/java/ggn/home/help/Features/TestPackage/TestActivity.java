package ggn.home.help.Features.TestPackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;

import ggn.home.help.Features.Internal.Base.BaseActivity;
import ggn.home.help.R;
import ggn.home.help.databinding.ActivityTestBinding;

public class TestActivity extends BaseActivity<ActivityTestBinding, TestPresenter> implements TestView
{

    public static <T> void start(Context context, T data)
    {
        Intent starter = new Intent(context, TestActivity.class);
        if (data != null) {
            starter.putExtra("constant here", (Parcelable) (data));
        }
        context.startActivity(starter);

    }

    @Override
    protected int setLayoutId()
    {
        return R.layout.activity_test;
    }

//    @Override
//    protected View setParentView()
//    {
//        return findViewById(R.id.activity_test);
//    }

    @Override
    protected void onCreateActivityG()
    {
        injectPresenter(new TestPresenter());
        getPresenter().attachView(this);
    }

    @Override
    public void setReview(TestModel testModel)
    {
        getDataBinder().setReview(testModel);
    }

    @Override
    public void initViews()
    {
//        setupToolbar("Gagan");
        getDataBinder().saveReview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getPresenter().changeData();
            }
        });
    }

    @Override
    public Context getActivityG()
    {
        return TestActivity.this;
    }

}
