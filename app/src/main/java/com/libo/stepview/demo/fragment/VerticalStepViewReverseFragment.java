package com.libo.stepview.demo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.libo.stepview.Item;
import com.libo.stepview.VerticalStepView;
import com.libo.stepview.demo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 日期：16/6/24 19:39
 * <p>
 * 描述：默认是反向画 default this VerticalStepViewIndicator draw is reverse
 */
public class VerticalStepViewReverseFragment extends Fragment
{
    View mView;
    private VerticalStepView mSetpview0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        mView = mView.inflate(getActivity(), R.layout.fragment_vertical_stepview, null);
        return mView;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        mSetpview0 = (VerticalStepView) mView.findViewById(R.id.step_view0);

        List<Item> list0 = new ArrayList<>();

        list0.add(new Item("1您已提交定单，等待系统确认","2019-10-10"));
        list0.add(new Item("2您的商品需要从外地调拨，我们会尽快处理，请耐心等待","2019-10-10"));
        list0.add(new Item("3您的订单已经进入亚洲第一仓储中心1号库准备出库","2019-10-10"));
        list0.add(new Item("4您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中","2019-10-10"));
        list0.add(new Item("5您的订单已打印完毕","2019-10-10"));
        list0.add(new Item("6感谢你在京东购物，欢迎你下次光临！","2019-10-10"));
        mSetpview0.setStepsViewIndicatorComplectingPosition(list0.size() -1)//设置完成的步数
                .setStepViewTexts(list0)//总步骤
                .setLinePaddingProportion(1)//设置indicator线与线间距的比例系数
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(getActivity(), android.R.color.white))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(getActivity(), R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(getActivity(), android.R.color.white))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(getActivity(), R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getActivity(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getActivity(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getActivity(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon


    }
}
