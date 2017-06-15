package ggn.home.help.Features.TestPackage;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ggn.home.help.Features.Internal.Base.BaseFragment;
import ggn.home.help.R;
import ggn.home.help.databinding.FragmentBlankBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends BaseFragment<TestPresenter> implements TestView
{
    private FragmentBlankBinding mBinding;

    public TestFragment()
    {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId()
    {
        return R.layout.fragment_blank;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        mBinding = DataBindingUtil.setContentView(getActivity(), getLayoutId());
        return mBinding.getRoot();
    }

    @Override
    protected void onCreateFragmentG()
    {
        injectPresenter(new TestPresenter());
        getPresenter().attachView(this);
    }

    @Override
    public void initViews()
    {
        mBinding.addReview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }

    @Override
    public void setReview(TestModel testModel)
    {

    }
}
