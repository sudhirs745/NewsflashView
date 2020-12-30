

!(Screenshot.png)



NewsflashView newsflashView = (NewsflashView) findViewById(R.id.newsflash);
newsflashView.setNewsflash(mDatas); 
newsflashView.setOnNewsflashClickListener(new NewsflashView.OnNewsflashClickListener() {
         @Override public void onNewsflashClick(int position) {
              Toast.makeText(MainActivity.this, mDatas.get(position), Toast.LENGTH_SHORT).show();
              }
         });
newsflashView.startFlipping();

