package com.ssebs.mahapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity
{
	private MediaPlayer mediaPlayerInception, mediaPlayerStreetFighter, mediaPlayerFusRoDah, mediaPlayer321, mediaPlayerExplosion, mediaPlayerHorn;

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//mediaPlayerInception = MediaPlayer.create(this, R.raw.bwah);
		mediaPlayerFusRoDah = MediaPlayer.create(this, R.raw.fusrodah);
		mediaPlayerStreetFighter = MediaPlayer.create(this, R.raw.hadouken);
		mediaPlayer321 = MediaPlayer.create(this, R.raw.trip);
		mediaPlayerExplosion = MediaPlayer.create(this, R.raw.explosion);
		mediaPlayerHorn = MediaPlayer.create(this, R.raw.horn);
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

	}

	public void pressInception (View view)
	{
		Toast.makeText(this, "Bwaah!!", Toast.LENGTH_SHORT).show();
		mediaPlayerInception = MediaPlayer.create(this, R.raw.bwah);
		mediaPlayerInception.start();

	}

	public void press321 (View view)
	{
		Toast.makeText(this, "3,2,1!!", Toast.LENGTH_SHORT).show();

		mediaPlayer321.start();
	}

	public void pressHorn (View view)
	{
		Toast.makeText(this, "OAHHHH!!", Toast.LENGTH_SHORT).show();

		mediaPlayerHorn.start();
	}

	public void pressStreetFighter (View view)
	{
		Toast.makeText(this, "HADOUKEN!!", Toast.LENGTH_SHORT).show();

		mediaPlayerStreetFighter.start();
	}

	public void pressFusRoDah (View view)
	{
		Toast.makeText(this, "FUS RO DAH!!", Toast.LENGTH_SHORT).show();

		mediaPlayerFusRoDah.start();
	}

	public void pressExplosion (View view)
	{
		Toast.makeText(this, "BOOM!!", Toast.LENGTH_SHORT).show();

		mediaPlayerExplosion.start();
	}

	public void toWeb (View view)
	{
		Uri webpage = Uri.parse("http://www.ssebs.com");
		Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
		startActivity(webIntent);
	}

	@Override
	public void onResume ()
	{
		mediaPlayer321 = MediaPlayer.create(this, R.raw.trip);
		mediaPlayerFusRoDah = MediaPlayer.create(this, R.raw.fusrodah);
		mediaPlayerStreetFighter = MediaPlayer.create(this, R.raw.hadouken);
		mediaPlayerInception = MediaPlayer.create(this, R.raw.bwah);
		mediaPlayerInception = MediaPlayer.create(this, R.raw.explosion);

		super.onResume();
	}

	@Override
	public void onPause ()
	{
//		mediaPlayerInception.release();
//		mediaPlayerInception = null;
//
//
//		mediaPlayerInception.release();
//		mediaPlayerInception = null;
		super.onPause();
	}

}
