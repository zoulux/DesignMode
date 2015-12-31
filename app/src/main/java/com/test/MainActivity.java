package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.AbstractFactoryModel.AbstractFactoryModel;
import com.BridgeMode.BridgeMode;
import com.BuilderMode.BuilderMode;
import com.ChainOfResponsibilityModel.ChainOfResponsibilityModel;
import com.CloneMode.CloneMode;
import com.CombinationMode.CombinationMode;
import com.CommandMode.CommandMode;
import com.DecorativeMode.DecorativeMode;
import com.FactoryMethodModel.FactoryMethodModel;
import com.FactoryMethodModel.IProduct;
import com.FactoryMethodModel.Tree;
import com.FlyweightMode.FlyweightMode;
import com.IntermediaryModel.IntermediaryModel;
import com.IteratorModel.IteratorModel;
import com.MemoMode.MemoMode;
import com.ObserverMode.ObserverMode;
import com.ParserMode.ParserMode;
import com.ProxyMode.ProxyMode;
import com.SingleMode.SingleMode;
import com.StateModel.StateModel;
import com.StrategyMode.StrategyMode;
import com.TemplateMethodModel.TemplateMethodModel;
import com.VisitorMode.VisitorMode;
import com.WindowMode.WindowMode;
import com.example.designmode.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickSingleMode(View view) { // ����
		SingleMode.getInstance();
	}

	public void onClickFactoryMethodModel(View view) {// ��������
		IProduct iProduct = new FactoryMethodModel();
		iProduct.productMethod();
		iProduct = new Tree();
		iProduct.productMethod();
	}

	public void onClickAbstractFactoryModel(View view) {// ���󹤳�
		AbstractFactoryModel.test();
	}

	public void onClickTemplateMethodModel(View view) {// ģ�淽��ģʽ
		TemplateMethodModel.test();
	}

	public void onClickBuilderMode(View view) {// ������ģʽ
		BuilderMode.test();
	}

	public void onClickProxyMode(View view) {// ����ģʽ
		ProxyMode.test();
	}

	public void onClickCloneMode(View view) {// ԭ��ģʽ
		CloneMode.test();
	}

	public void onClickIntermediaryModel(View view) {// �н���ģʽ
		IntermediaryModel.test1();
		IntermediaryModel.test2();
	}

	public void onClickCommandMode(View view) {// ����ģʽ
		CommandMode.test();
	}

	public void onChainOfResponsibilityModel(View view) {// ������ģʽ
		ChainOfResponsibilityModel.test();
	}

	public void onClickDecorativeMode(View view) {// װ��ģʽ
		DecorativeMode.test();
	}

	public void onClickStrategyMode(View view) {// ����ģʽ
		StrategyMode.test();
	}

	public void onClickIteratorModel(View view) {// ģʽ
		IteratorModel.test();
	}

	public void onClickCombinationMode(View view) {// ���ģʽ
		CombinationMode.test();
	}

	public void onClickObserverMode(View view) {// �۲���ģʽ
		ObserverMode.test();
	}

	public void onClickWindowMode(View view) {// ����ģʽ
		WindowMode.test();
	}

	public void onClickMemoMode(View view) {// ����¼ģʽ
		MemoMode.test();
	}

	public void onClickVisitorMode(View view) {// ������ģʽ
		VisitorMode.test();
	}

	public void onClickStateModel(View view) {// ״̬ģʽ
		StateModel.test();
	}

	public void onClickParserMode(View view) {// ������ģʽ
		ParserMode.test();
	}

	public void onClickFlyweightMode(View view) {// ��Ԫģʽ
		FlyweightMode.test();
	}

	public void onClickBridgeMode(View view) {// ����ģʽ
		BridgeMode.test();
	}
}
