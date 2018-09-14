package com.example.caro.languagesupportexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main_website_button)
    Button mWebsite;
    @BindView(R.id.activity_main_youtube_button)
    Button mYoutube;
    @BindView(R.id.activity_main_facebook_page_button)
    Button mFb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_main_website_button)
    public void onClickWebsiteButton() {
        try{
            Intent i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse(getString(R.string.web_link)));
            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_no_browser_found), Toast.LENGTH_LONG).show();
        }

    }

    @OnClick(R.id.activity_main_youtube_button)
    public void onClicYoutubeButton() {
        try{
            Intent i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse(getString(R.string.youtube_link)));
            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_no_browser_found), Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.activity_main_facebook_page_button)
    public void onClickFbButton() {
        try{
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.fb_link)));
            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_no_browser_found), Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.activity_main_github_textView)
    public void onClickGithubLink() {
        try{
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.github_link)));
            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_no_browser_found), Toast.LENGTH_LONG).show();
        }
    }

}
