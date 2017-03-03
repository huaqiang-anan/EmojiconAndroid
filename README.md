# EmojiconAndroid
Android端表情模块

![Screen](/emojicon_effect.jpg)

效果图还是不错的，实现的原理我就不一一称述了，只讲一下它的使用方法，


你只需要把emojiconlibrary 作为模块导入到项目中就可以了，然后在调用的时候很简单，但是有一点需要注意：在进去表情页面之前需要将表情的标识进行初始化，调用一个方法就OK了。
方法是： 

		FaceConversionUtil.getInstace().getFileText(getApplication());  
	
调用是很简单, 具体的看一下源码就好了。