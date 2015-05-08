package com.ssebs.mahapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity
{

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//add api
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
	}

	public void pressBanana (View view)
	{
		MediaPlayer.create(this, R.raw.banana).start();
	}

	public void pressBitchWhere (View view)
	{
		MediaPlayer.create(this, R.raw.bitch_where).start();
	}

	public void pressBlind (View view)
	{
		MediaPlayer.create(this, R.raw.blind).start();
	}

	public void pressInception (View view)
	{
		MediaPlayer.create(this, R.raw.bwah).start();
	}

	public void pressDaamn (View view)
	{
		MediaPlayer.create(this, R.raw.daamn).start();
	}

	public void pressNuts (View view)
	{
		MediaPlayer.create(this, R.raw.deez_nuts).start();
	}

	public void pressExplosion (View view)
	{
		MediaPlayer.create(this, R.raw.explosion).start();
	}

	public void pressFleek (View view)
	{
		MediaPlayer.create(this, R.raw.fleek).start();
	}

	public void pressFusRoDah (View view)
	{
		MediaPlayer.create(this, R.raw.fusrodah).start();
	}

	public void pressStreetFighter (View view)
	{
		MediaPlayer.create(this, R.raw.hadouken).start();
	}

	public void pressHorn (View view)
	{
		MediaPlayer.create(this, R.raw.horn).start();
	}

	public void pressIggy (View view)
	{
		MediaPlayer.create(this, R.raw.iggy).start();
	}

	public void pressJeff (View view)
	{
		MediaPlayer.create(this, R.raw.jeff).start();
	}

	public void pressLookLikeUh (View view)
	{
		MediaPlayer.create(this, R.raw.look_like_uhh).start();
	}

	public void pressNoNgga (View view)
	{
		MediaPlayer.create(this, R.raw.no_ngga).start();
	}

	public void pressNotMyDad (View view)
	{
		MediaPlayer.create(this, R.raw.not_my_dad).start();
	}

	public void pressPorsche (View view)
	{
		MediaPlayer.create(this, R.raw.porsche).start();
	}

	public void pressRavioli (View view)
	{
		MediaPlayer.create(this, R.raw.ravioli).start();
	}

	public void pressRlyNgga (View view)
	{
		MediaPlayer.create(this, R.raw.really_ngga).start();
	}

	public void pressSurprise (View view)
	{
		MediaPlayer.create(this, R.raw.surprise_mf).start();
	}

	public void press321 (View view)
	{
		MediaPlayer.create(this, R.raw.trip).start();
	}

	public void pressTwentyOne (View view)
	{
		MediaPlayer.create(this, R.raw.twenty_one).start();
	}

	public void pressWhip (View view)
	{
		MediaPlayer.create(this, R.raw.whip).start();
	}

	public void pressWrist (View view)
	{
		MediaPlayer.create(this, R.raw.wrist).start();
	}


	public void toWeb (View view)
	{
		Uri webpage = Uri.parse("http://www.ssebs.com");
		Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
		startActivity(webIntent);
	}

	@Override
	public void onPause ()
	{
		super.onPause();
	}

}
