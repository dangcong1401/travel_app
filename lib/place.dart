class Place {
  final int id;
  final String name;
  final String image;

  Place({
    required this.id,
    required this.name,
    required this.image,
  });

  factory Place.fromJson(Map<String, dynamic> json) {
    return Place(
      id: json['id'],
      name: json['name'],
      image: json['image'],
    );
  }
}