import 'package:flutter/material.dart';

void main() {
  runApp(AppWidget());
}

class AppWidget extends StatelessWidget {
  late final String title;
  
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(
        child: Text(
          'Texto para teste 2',
          textDirection: TextDirection.ltr,
          style: TextStyle(color: Colors.white, fontSize: 50.0),
        ),
      ),
    );
  }
}
