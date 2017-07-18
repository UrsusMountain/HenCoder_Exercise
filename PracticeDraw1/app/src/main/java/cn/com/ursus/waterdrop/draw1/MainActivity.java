package cn.com.ursus.waterdrop.draw1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.draw_color,R.layout.view_color));
        pageModels.add(new PageModel(R.string.draw_circle,R.layout.view_circle));
        pageModels.add(new PageModel(R.string.draw_rect,R.layout.view_rect));
        pageModels.add(new PageModel(R.string.draw_point,R.layout.view_point));
        pageModels.add(new PageModel(R.string.draw_oval,R.layout.view_oval));
        pageModels.add(new PageModel(R.string.draw_line,R.layout.view_line));
        pageModels.add(new PageModel(R.string.draw_round,R.layout.view_round));
        pageModels.add(new PageModel(R.string.draw_arc,R.layout.view_arc));
        pageModels.add(new PageModel(R.string.draw_path,R.layout.view_path));
        pageModels.add(new PageModel(R.string.histogram,R.layout.view_histogram));
        pageModels.add(new PageModel(R.string.piechart,R.layout.view_piechart));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        fillData();
    }

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    private void fillData() {
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PageFragment.newInstance(pageModel.layoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }

    private class PageModel{
        @StringRes int titleRes;
        @LayoutRes int layoutRes;

        public PageModel(@StringRes int titleRes,@LayoutRes int layoutRes) {
            this.titleRes = titleRes;
            this.layoutRes = layoutRes;
        }
    }
}
