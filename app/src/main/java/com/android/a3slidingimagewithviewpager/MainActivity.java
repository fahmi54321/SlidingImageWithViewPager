package com.android.a3slidingimagewithviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    private String[] images = {
            "https://www.google.co.id/imgres?imgurl=https%3A%2F%2Fp4.wallpaperbetter.com%2Fwallpaper%2F135%2F708%2F936%2Fbeautiful-pictures-of-nature-1920x1200-wallpaper-preview.jpg&imgrefurl=https%3A%2F%2Fwww.wallpaperbetter.com%2Fid%2Fhd-wallpaper-umfum&tbnid=xCp3HPPn-cu4GM&vet=12ahUKEwintLqxy6fwAhVx0nMBHTfODEYQMygEegQIARBd..i&docid=tYMUYy6woTYvZM&w=728&h=455&itg=1&q=gambarindah&hl=en&safe=strict&ved=2ahUKEwintLqxy6fwAhVx0nMBHTfODEYQMygEegQIARBd",
            "https://www.google.co.id/imgres?imgurl=https%3A%2F%2Flh6.googleusercontent.com%2Fproxy%2Fa4o3sG9Mgv8wNrrvbRc4V4m_ZFWeDro4RYeCprZ4I7RskC0wdmzQTd2nGea8Yw-evvF0fp9D5VJ9gy2CM8AIVe9KY1K0w1p73IKiOcHRx5FnAmMTPy5eMX0yfRfXF0qa1zGpwJ5je6aNClQ%3Ds0-d&imgrefurl=https%3A%2F%2Fvinagambar.blogspot.com%2F2021%2F02%2Fcari-gambar-indah-kota-jogja.html&tbnid=BNS4w0HAxsA6FM&vet=12ahUKEwintLqxy6fwAhVx0nMBHTfODEYQMygPegQIARB1..i&docid=VxfXS-jM5zOOoM&w=900&h=644&itg=1&q=gambarindah&hl=en&safe=strict&ved=2ahUKEwintLqxy6fwAhVx0nMBHTfODEYQMygPegQIARB1"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(MainActivity.this,images);
        viewPager.setAdapter(viewPagerAdapter);

    }
}