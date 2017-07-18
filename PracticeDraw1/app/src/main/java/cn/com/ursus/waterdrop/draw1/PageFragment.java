package cn.com.ursus.waterdrop.draw1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/**
 * Author:  ursus
 * Date:    17/7/11
 * Function:
 */

public class PageFragment extends Fragment {

    private static final String ARGS_LAYOUT_RESOURCE = "layout_resource";

    @LayoutRes
    int layoutRes;

    public static PageFragment newInstance(@LayoutRes int layoutRes) {

        Bundle args = new Bundle();
        args.putInt(ARGS_LAYOUT_RESOURCE, layoutRes);

        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragemt_page, container, false);

        ViewStub viewStub = (ViewStub) view.findViewById(R.id.viewStub);
        viewStub.setLayoutResource(layoutRes);
        viewStub.inflate();

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            layoutRes = args.getInt(ARGS_LAYOUT_RESOURCE);
        }
    }
}
