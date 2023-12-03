void main() {
  print("43".parseInt());
}

extension NewClass on String {
  int parseInt() {
    return int.parse(this);
  }
}
