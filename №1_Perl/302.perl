my @strings = ();
while (<>) {
    s/<.*?>//g;
    push(@strings, $_);
}
my $wasNotEmptyString = "false";
my $needPrintEmpty = "false";
foreach (@strings) {
    if (/^(\s*)$/) {
        if($wasNotEmptyString eq "true") {
            $needPrintEmpty = "true";
        }
    } else {
        if ($needPrintEmpty eq "true") {
            print "\n";
            $needPrintEmpty = "false";
        }
        s/^(\s+)(.+?)(\s+)$/$2/;
        s/(\s+)/ /g;
        s/^(.*?)(\s*)$/$1/;
        print;
        print "\n";
        $wasNotEmptyString = "true";
    }
}

