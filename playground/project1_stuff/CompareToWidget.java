class CompareToWidget implements Comparable<Widget> {
  private Widget widget;

  public CompareToWidget(Widget widget) {
    this.widget = widget;
  }

  private int sumTotalIds(Widget w) {
    int sum = 0;
    for (Stuff stuff : w.stuffs) {
      sum += stuff.id;
    }
    return sum;
  }

  // compare widget order by id
  @Override
  public int compareTo(Widget other) {
    // sum of ids of this widget
    int sumThis = sumTotalIds(this.widget);

    // sum of ids of other widget
    int sumOther = sumTotalIds(other);

    // compare sum of ids
    if (sumThis < sumOther) {
      return -1;
    } else if (sumThis > sumOther) {
      return 1;
    }

    return 0;

  }

}
