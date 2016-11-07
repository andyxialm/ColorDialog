#ColorDialog & PromptDialog
[![](https://jitpack.io/v/andyxialm/ColorDialog.svg)](https://jitpack.io/#andyxialm/ColorDialog)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ColorDialog-brightgreen.svg?style=flat)]()

* ColorDialog support: Text Mode, Image Mode, Text & Image Mode
* PromptDialog support: Success, Info, Error, Warning, Help
* Support custom in/out animation
* PromptDialog's UI from Dribbble[@Diego Faria](https://dribbble.com/shots/1626595-Feedback-dialogs-collection-FREE-PSD "Title"), Thanks.

### Usage

#### Gradle
##### Step 1. Add the JitPack repository to your build file
~~~ xml
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
~~~

##### Step 2. Add the dependency
~~~ xml
dependencies {
    compile 'com.github.andyxialm:ColorDialog:1.0.0'
}
~~~

#### Maven
##### Step 1. Add the JitPack repository to your build file
~~~ xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
~~~

##### Step 2. Add the dependency
~~~ xml
<dependency>
    <groupId>com.github.andyxialm</groupId>
    <artifactId>ColorDialog</artifactId>
    <version>1.0.0</version>
</dependency>
~~~

##### Java Code:

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




### Screenshots:

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
