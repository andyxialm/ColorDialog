#ColorDialog & PromptDialog

* 简单封装的对话框控件 ColorDialog & PromptDialog
* ColorDialog支持三种显示形式: Text Mode, Image Mode, Text & Image Mode
* PromptDialog提供默认五种显示形式: Success, Info, Error, Warning, Help 
* 提供默认的进出动画, 支持自定义动画
* PromptDialog UI来自于Dribbble的设计师 [@Diego Faria](https://dribbble.com/shots/1626595-Feedback-dialogs-collection-FREE-PSD "Title"), 再次表示感谢



### 调用方式:

<pre><code>
ColorDialog dialog = new ColorDialog(this);
dialog.setTitle(getString(R.string.operation));
dialog.setContentText(getString(R.string.content_text));
dialog.setContentImage(getResources().getDrawable(R.mipmap.sample_img));
dialog.setPositiveListener(getString(R.string.delete), new ColorDialog.OnPositiveListener() {
    @Override
    public void onClick(ColorDialog dialog) {
        Toast.makeText(MainActivity.this, dialog.getPositiveText().toString(), Toast.LENGTH_SHORT).show();
    }
})
.setNegativeListener(getString(R.string.cancel), new ColorDialog.OnNegativeListener() {
    @Override
    public void onClick(ColorDialog dialog) {
        Toast.makeText(MainActivity.this, dialog.getNegativeText().toString(), Toast.LENGTH_SHORT).show();
        dialog.dismiss();
    }
}).show();
</code></pre>

<pre><code>
new PromptDialog(this)
    .setDialogType(PromptDialog.DIALOG_TYPE_SUCCESS)
    .setAnimationEnable(true)
    .setTitleText(getString(R.string.success))
    .setContentText(getString(R.string.text))
    .setPositiveListener(getString(R.string.ok), new PromptDialog.OnPositiveListener() {
        @Override
        public void onClick(PromptDialog dialog) {
            dialog.dismiss();
        }
    }).show();
</code></pre>




### 效果图:

* PromptDialog Success

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_type_success.png?raw=true )

* PromptDialog Info

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_type_info.png?raw=true)

* PromptDialog Help

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_type_help.png?raw=true)

* PromptDialog Error

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_type_error.png?raw=true)

* PromptDialog Warning

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_type_warning.png?raw=true)


* ColorDialog Text Mode

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_text.png?raw=true)

* ColorDialog Image Mode

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_img.png?raw=true)

* ColorDialog Text&Image Mode

![](https://github.com/andyxialm/ColorDialog/blob/master/art/Screenshot_imgtext.png?raw=true)


#License
<p>ColorDialog is available under the MIT license.</p>
