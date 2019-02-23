package com.a22939.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.a22939.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId){
        //启动CrimeActivity时，传递附加到Intent extra上的crime ID，
        //CrimeFragment就能知道该显示哪个Crime。 这需要在CrimeActivity中新增newIntent方法
        //创建了显式intent后，调用putExtra(...)方法，传入匹配crimeId的字符串键与键值。
        //这里， 由于UUID是Serializable对象，因此我们需要调用putExtra(String, Serializable)方法。
        Intent intent = new Intent(packageContext,CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        //return new CrimeFragment();
        UUID crimeId = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }
}

