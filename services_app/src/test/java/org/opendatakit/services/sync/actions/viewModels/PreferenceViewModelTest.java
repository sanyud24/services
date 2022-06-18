package org.opendatakit.services.sync.actions.viewModels;

import static org.junit.Assert.assertEquals;

import android.os.Build;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opendatakit.services.preferences.PreferenceViewModel;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = {Build.VERSION_CODES.O_MR1})
public class PreferenceViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();
    private PreferenceViewModel preferenceViewModel;

    @Before
    public void setUp() throws Exception {
        preferenceViewModel = new PreferenceViewModel();
    }

    @Test
    public void checkAdminConfigured() throws InterruptedException {
        preferenceViewModel.setAdminConfigured(true);
        assertEquals(true, preferenceViewModel.getAdminConfigured().getValue());
    }

    @Test
    public void checkAdminMode() {
        preferenceViewModel.setAdminMode(true);
        assertEquals(true, preferenceViewModel.getAdminMode().getValue());
    }
}
