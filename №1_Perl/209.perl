while (<>) {
    s/(\()([^\)]*)(\))/$1$3/g;
    print;
}
