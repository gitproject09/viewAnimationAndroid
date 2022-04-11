/*
 * MIT License
 *
 * Copyright (c) 2017 Sopan Ahmed
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.sopan.view_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.os.Bundle;

import com.sopan.view_anim.animations.Attention;
import com.sopan.view_anim.animations.Bounce;
import com.sopan.view_anim.animations.Fade;
import com.sopan.view_anim.animations.Flip;
import com.sopan.view_anim.animations.Render;
import com.sopan.view_anim.animations.Rotate;
import com.sopan.view_anim.animations.Slide;
import com.sopan.view_anim.animations.Zoom;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Render render;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAttentionBounce = findViewById(R.id.btn_attention_bounce); // bounce
        Button buttonAttentionFlash = findViewById(R.id.btn_attention_flash); // flash
        Button buttonAttentionPulse = findViewById(R.id.btn_attention_pulse); // pulse
        Button buttonAttentionRuberband = findViewById(R.id.btn_attention_ruberband); // ruberband
        Button buttonAttentionShake = findViewById(R.id.btn_attention_shake); // shake
        Button buttonAttentionStandup = findViewById(R.id.btn_attention_stand_up); // standup
        Button buttonAttentionSwing = findViewById(R.id.btn_attention_swing); // swing
        Button buttonAttentionTada = findViewById(R.id.btn_attention_tada); // tada
        Button buttonAttentionWave = findViewById(R.id.btn_attention_wave); // wave
        Button buttonAttentionWobble = findViewById(R.id.btn_attention_wobble); // wobble

        Button buttonBounceInLeft = findViewById(R.id.btn_bounce_inleft); // bounce in left
        Button buttonBounceInRight = findViewById(R.id.btn_bounce_inright); // bounce in right
        Button buttonBounceInUp = findViewById(R.id.button_bounce_inup); // bounce in up
        Button buttonBounceInDown = findViewById(R.id.btn_bounce_indown); // bounce in down
        Button buttonBounceIn = findViewById(R.id.btn_bounce_in); // bounce in

        Button buttonFadeInUp = findViewById(R.id.btn_fade_inup); // fade in up
        Button buttonFadeInDown = findViewById(R.id.btn_fade_indown); // fade in down
        Button buttonFadeInRight = findViewById(R.id.btn_fade_inright); // fade in right
        Button buttonFadeInLeft = findViewById(R.id.btn_fade_inleft); // fade left

        Button buttonFadeOutUp = findViewById(R.id.btn_fade_outup); // fade out up
        Button buttonFadeOutDown = findViewById(R.id.btn_fade_outdown); // fade out down
        Button buttonFadeOutRight = findViewById(R.id.btn_fade_outright); // fade out right
        Button buttonFadeOutLeft = findViewById(R.id.btn_fade_outleft); // fade out left

        Button buttonFadeIn = findViewById(R.id.btn_fade_in); // fade in
        Button buttonFadeOut = findViewById(R.id.btn_fade_out); // fade out

        Button buttonFlipInX = findViewById(R.id.btn_flip_inx); // flip in x
        Button buttonFlipInY = findViewById(R.id.btn_flip_iny); // flip in y
        Button buttonFlipOutX = findViewById(R.id.btn_flip_outx); // flip out x
        Button buttonFlipOutY = findViewById(R.id.btn_flip_outy); // flip out y

        Button buttonRotateInDownLeft = findViewById(R.id.btn_rotate_indownleft); // rotate in down left
        Button buttonRotateInDownRight = findViewById(R.id.btn_rotate_indownright); // rotate in down right
        Button buttonRotateInUpLeft = findViewById(R.id.btn_rotate_inupleft); // rotate in up left
        Button buttonRotateInUpRight = findViewById(R.id.btn_rotate_inupright); // rotate in up right
        Button buttonRotateOutDownLeft = findViewById(R.id.btn_rotate_outdownleft); // rotate out down left
        Button buttonRotateOutDownRight = findViewById(R.id.btn_rotate_outdownright); // rotate out down right
        Button buttonRotateOutUpLeft = findViewById(R.id.btn_rotate_outupleft); // rotate out up left
        Button buttonRotateOutUpRight = findViewById(R.id.btn_rotate_outupright); // rotate out up right

        Button buttonRotateIn = findViewById(R.id.btn_rotate_in); // rotate in
        Button buttonRotateOut = findViewById(R.id.btn_rotate_out); // rotate out

        Button buttonSlideInDown = findViewById(R.id.btn_slide_indown); // slide in down
        Button buttonSlideInLeft = findViewById(R.id.btn_slide_inleft); // slide in left
        Button buttonSlideInRight = findViewById(R.id.btn_slide_inright); // slide in right
        Button buttonSlideInUp = findViewById(R.id.btn_slide_inup); // slide in up
        Button buttonSlideOutDown = findViewById(R.id.btn_slide_outdown); // slide out down
        Button buttonSlideOutLeft = findViewById(R.id.btn_slide_outleft); // slide out left
        Button buttonSlideOutRight = findViewById(R.id.btn_slide_outright); // slide out right
        Button buttonSlideOutUp = findViewById(R.id.btn_slide_outup); // slide out up

        Button buttonZoomIn = findViewById(R.id.btn_zoom_in); // zoom in
        Button buttonZoomInDown = findViewById(R.id.btn_zoom_indown); // zoom in down
        Button buttonZoomInLeft = findViewById(R.id.btn_zoom_inleft); // zoom in left
        Button buttonZoomInRight = findViewById(R.id.btn_zoom_inright); // error
        Button buttonZoomInUp = findViewById(R.id.btn_zoom_inup); // zoom in up
        Button buttonZoomOut = findViewById(R.id.btn_zoom_out); /// zoom out
        Button buttonZoomOutDown = findViewById(R.id.btn_zoom_outdown); // zoom out down
        Button buttonZoomOutLeft = findViewById(R.id.btn_zoom_outleft); // zoom out left
        Button buttonZoomOutRight = findViewById(R.id.btn_zoom_outright); // zoom out right
        Button buttonZoomOutUp = findViewById(R.id.btn_zoom_outup); // zoom out up

        imageView = findViewById(R.id.iv_image);

        render = new Render(this);
        render.setDuration(1000);

        // Attention Button Clicks
        buttonAttentionBounce.setOnClickListener(this);
        buttonAttentionFlash.setOnClickListener(this);
        buttonAttentionPulse.setOnClickListener(this);
        buttonAttentionRuberband.setOnClickListener(this);
        buttonAttentionShake.setOnClickListener(this);
        buttonAttentionStandup.setOnClickListener(this);
        buttonAttentionSwing.setOnClickListener(this);
        buttonAttentionTada.setOnClickListener(this);
        buttonAttentionWave.setOnClickListener(this);
        buttonAttentionWobble.setOnClickListener(this);

        // Bounce Button Clicks
        buttonBounceInLeft.setOnClickListener(this);
        buttonBounceInRight.setOnClickListener(this);
        buttonBounceInUp.setOnClickListener(this);
        buttonBounceInDown.setOnClickListener(this);
        buttonBounceIn.setOnClickListener(this);

        // Fade Button Clicks
        buttonFadeInUp.setOnClickListener(this);
        buttonFadeInDown.setOnClickListener(this);
        buttonFadeInRight.setOnClickListener(this);
        buttonFadeInLeft.setOnClickListener(this);
        buttonFadeOutUp.setOnClickListener(this);
        buttonFadeOutDown.setOnClickListener(this);
        buttonFadeOutRight.setOnClickListener(this);
        buttonFadeOutLeft.setOnClickListener(this);
        buttonFadeIn.setOnClickListener(this);
        buttonFadeOut.setOnClickListener(this);

        // Flip Button Clicks
        buttonFlipInX.setOnClickListener(this);
        buttonFlipInY.setOnClickListener(this);
        buttonFlipOutX.setOnClickListener(this);
        buttonFlipOutY.setOnClickListener(this);

        // Rotate Button Clicks
        buttonRotateInDownLeft.setOnClickListener(this);
        buttonRotateInDownRight.setOnClickListener(this);
        buttonRotateInUpLeft.setOnClickListener(this);
        buttonRotateInUpRight.setOnClickListener(this);
        buttonRotateOutDownLeft.setOnClickListener(this);
        buttonRotateOutDownRight.setOnClickListener(this);
        buttonRotateOutUpLeft.setOnClickListener(this);
        buttonRotateOutUpRight.setOnClickListener(this);
        buttonRotateIn.setOnClickListener(this);
        buttonRotateOut.setOnClickListener(this);

        // Slide Button Clicks
        buttonSlideInDown.setOnClickListener(this);
        buttonSlideInLeft.setOnClickListener(this);
        buttonSlideInRight.setOnClickListener(this);
        buttonSlideInUp.setOnClickListener(this);
        buttonSlideOutDown.setOnClickListener(this);
        buttonSlideOutLeft.setOnClickListener(this);
        buttonSlideOutRight.setOnClickListener(this);
        buttonSlideOutUp.setOnClickListener(this);

        // Zoom Button Clicks
        buttonZoomIn.setOnClickListener(this);
        buttonZoomInDown.setOnClickListener(this);
        buttonZoomInLeft.setOnClickListener(this);
        buttonZoomInRight.setOnClickListener(this);
        buttonZoomInUp.setOnClickListener(this);
        buttonZoomOut.setOnClickListener(this);
        buttonZoomOutDown.setOnClickListener(this);
        buttonZoomOutLeft.setOnClickListener(this);
        buttonZoomOutRight.setOnClickListener(this);
        buttonZoomOutUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            // Attenstion Animations
            case R.id.btn_attention_bounce:
                startAnimation(Attention.Bounce(imageView));
                break;
            case R.id.btn_attention_flash: // flash
                startAnimation(Attention.Flash(imageView));
                break;
            case R.id.btn_attention_pulse: // pulse
                startAnimation(Attention.Pulse(imageView));
                break;
            case R.id.btn_attention_ruberband: // ruberband
                startAnimation(Attention.RuberBand(imageView));
                break;
            case R.id.btn_attention_shake: // shake
                startAnimation(Attention.Shake(imageView));
                break;
            case R.id.btn_attention_stand_up: // standup
                startAnimation(Attention.StandUp(imageView));
                break;
            case R.id.btn_attention_swing: // swing
                startAnimation(Attention.Swing(imageView));
                break;
            case R.id.btn_attention_tada: // tada
                startAnimation(Attention.Tada(imageView));
                break;
            case R.id.btn_attention_wave: // wave
                startAnimation(Attention.Wave(imageView));
                break;
            case R.id.btn_attention_wobble: // wobble
                startAnimation(Attention.Wobble(imageView));
                break;

            // Bounce Animations
            case R.id.btn_bounce_inleft: // bounce in left
                startAnimation(Bounce.InLeft(imageView));
                break;
            case R.id.btn_bounce_inright: // bounce in right
                startAnimation(Bounce.InRight(imageView));
                break;
            case R.id.button_bounce_inup: // bounce in up
                startAnimation(Bounce.InUp(imageView));
                break;
            case R.id.btn_bounce_indown: // bounce in down
                startAnimation(Bounce.InDown(imageView));
                break;
            case R.id.btn_bounce_in: // bounce in
                startAnimation(Bounce.In(imageView));
                break;

            // Fade Animations
            case R.id.btn_fade_inup: // fade in up
                startAnimation(Fade.InUp(imageView));
                break;
            case R.id.btn_fade_indown: // fade in down
                startAnimation(Fade.InDown(imageView));
                break;
            case R.id.btn_fade_inright: // fade in right
                startAnimation(Fade.InRight(imageView));
                break;
            case R.id.btn_fade_inleft: // fade left
                startAnimation(Fade.InLeft(imageView));
                break;
            case R.id.btn_fade_outup: // fade out up
                startAnimation(Fade.OutUp(imageView));
                break;
            case R.id.btn_fade_outdown: // fade out down
                startAnimation(Fade.OutDown(imageView));
                break;
            case R.id.btn_fade_outright: // fade out right
                startAnimation(Fade.OutRight(imageView));
                break;
            case R.id.btn_fade_outleft: // fade out left
                startAnimation(Fade.OutLeft(imageView));
                break;
            case R.id.btn_fade_in: // fade in
                startAnimation(Fade.In(imageView));
                break;
            case R.id.btn_fade_out: // fade out
                startAnimation(Fade.Out(imageView));
                break;

            // Flip Animations
            case R.id.btn_flip_inx: // flip in x
                startAnimation(Flip.InX(imageView));
                break;
            case R.id.btn_flip_iny: // flip in y
                startAnimation(Flip.InY(imageView));
                break;
            case R.id.btn_flip_outx: // flip out x
                startAnimation(Flip.OutX(imageView));
                break;
            case R.id.btn_flip_outy: // flip out y
                startAnimation(Flip.OutY(imageView));
                break;

            // Rotatation Animations
            case R.id.btn_rotate_indownleft: // rotate in down left
                startAnimation(Rotate.InDownLeft(imageView));
                break;
            case R.id.btn_rotate_indownright: // rotate in down right
                startAnimation(Rotate.InDownRight(imageView));
                break;
            case R.id.btn_rotate_inupleft: // rotate in up left
                startAnimation(Rotate.InUpLeft(imageView));
                break;
            case R.id.btn_rotate_inupright: // rotate in up right
                startAnimation(Rotate.InUpRight(imageView));
                break;
            case R.id.btn_rotate_outdownleft: // rotate out down left
                startAnimation(Rotate.OutDownLeft(imageView));
                break;
            case R.id.btn_rotate_outdownright: // rotate out down right
                startAnimation(Rotate.OutDownRight(imageView));
                break;
            case R.id.btn_rotate_outupleft: // rotate out up left
                startAnimation(Rotate.OutUpLeft(imageView));
                break;
            case R.id.btn_rotate_outupright: // rotate out up right
                startAnimation(Rotate.OutUpRight(imageView));
                break;
            case R.id.btn_rotate_in: // rotate in
                startAnimation(Rotate.In(imageView));
                break;
            case R.id.btn_rotate_out: // rotate out
                startAnimation(Rotate.Out(imageView));
                break;

            // Slide Animations
            case R.id.btn_slide_indown: // slide in down
                startAnimation(Slide.InDown(imageView));
                break;
            case R.id.btn_slide_inleft: // slide in left
                startAnimation(Slide.InLeft(imageView));
                break;
            case R.id.btn_slide_inright: // slide in right
                startAnimation(Slide.InRight(imageView));
                break;
            case R.id.btn_slide_inup: // slide in up
                startAnimation(Slide.InUp(imageView));
                break;
            case R.id.btn_slide_outdown: // slide out down
                startAnimation(Slide.OutDown(imageView));
                break;
            case R.id.btn_slide_outleft: // slide out left
                startAnimation(Slide.OutLeft(imageView));
                break;
            case R.id.btn_slide_outright: // slide out right
                startAnimation(Slide.OutRight(imageView));
                break;
            case R.id.btn_slide_outup: // slide out up
                startAnimation(Slide.OutUp(imageView));
                break;

            // Zoom Animations
            case R.id.btn_zoom_in: // zoom in
                startAnimation(Zoom.In(imageView));
                break;
            case R.id.btn_zoom_indown: // zoom in down
                startAnimation(Zoom.InDown(imageView));
                break;
            case R.id.btn_zoom_inleft: // zoom in left
                startAnimation(Zoom.InLeft(imageView));
                break;
            case R.id.btn_zoom_inright: // error
                startAnimation(Zoom.InRight(imageView));
                break;
            case R.id.btn_zoom_inup: // zoom in up
                startAnimation(Zoom.InUp(imageView));
                break;
            case R.id.btn_zoom_out: /// zoom out
                startAnimation(Zoom.Out(imageView));
                break;
            case R.id.btn_zoom_outdown: // zoom out down
                startAnimation(Zoom.OutDown(imageView));
                break;
            case R.id.btn_zoom_outleft: // zoom out left
                startAnimation(Zoom.OutLeft(imageView));
                break;
            case R.id.btn_zoom_outright: // zoom out right
                startAnimation(Zoom.OutRight(imageView));
                break;
            case R.id.btn_zoom_outup: // zoom out up
                startAnimation(Zoom.OutUp(imageView));
                break;

        }
    }

    private void startAnimation(AnimatorSet animationSet) {
        render.setAnimation(animationSet);
        render.start();
    }
}
