rm -rf ./.git/hooks

git clone git@github.com:Banjomann/GitHooks.git ./.git/hooks

git pull --tags

vers="$(git describe)"

len=${#vers}
for((i=$len-1;i>=0;i--)); do rev="$rev${vers:$i:1}"; done

vers="$(echo $rev | cut -d'-' -f 3,4)"

len=${#vers}
for((i=$len-2;i>=0;i--)); do shortVers="$shortVers${vers:$i:1}"; done

echo "$shortVers"