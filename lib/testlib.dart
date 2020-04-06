import 'package:flutter/material.dart';

class libApp extends StatelessWidget{


  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return MaterialApp(
      title: 'My cat',
      theme: ThemeData(
        primarySwatch: Colors.red
      ),
      home: TestLibHome(title: 'lee video player'),
    );
  }

}


class TestLibHome extends StatefulWidget{

  final String title;

  ///不确定构造函数是否必须，待测试
  TestLibHome({Key key, this.title}) : super(key:key);

  @override
  State<StatefulWidget> createState() {
    ///创建对象虽然不要new 关键字，但是调用构造函数（）还是要的
    return CatState();
  }

}

class CatState extends State<TestLibHome> {

  String url = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1704191797,1344164735&fm=26&gp=0.jpg";

  @override
  void initState() {
    // TODO: implement initState
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),

      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Image.network(
              url,
              width: 320,
              height: 180,
              fit: BoxFit.fitWidth,
            )
          ],
        ),
      ),
    );
  }

}