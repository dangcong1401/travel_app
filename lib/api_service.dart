import 'dart:convert';
import 'package:http/http.dart' as http;
import 'place.dart';

class ApiService {
  static const String baseUrl =
      'http://localhost:8080/api';

  static Future<List<Place>> getAllPlace() async {
    final response = await http.get(
      Uri.parse('$baseUrl/getAllPlace'),
    );

    if (response.statusCode == 200) {
      final List data = jsonDecode(response.body);

      return data
          .map((item) => Place.fromJson(item))
          .toList();
    } else {
      throw Exception(
        'Failed to load places: ${response.statusCode}',
      );
    }
  }
}