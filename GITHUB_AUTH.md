# Authenticate to GitHub (via SSH keys)

## 1. Generate a new ssh key

1. Open the terminal (VSCode, Dev Container)
2. Type `ssh-keygen -C "<your-email-address-here>"`. Confirm and set a passphrase.
3. Type `cat /home/vscode/.ssh/<ssh-key-name>.pub` and copy the output.

## 2. Register ssh key at GitHub

1. Go to your GitHub account.
2. Navigate to `Settings > SSH and GPG keys`
3. Add a new SSH key. Select `Authentication Key`. Paste the copied output as key.

## 3. (Optional) Sign commits

1. Repeat [Register SSH key](#2-register-ssh-key-at-github) but select `Signing key` instead of `Authentication Key`
2. Go back to the terminal (VSCode, Dev Container)
3. Enter follwing:
```bash
git config --global gpg.format ssh
git config --global user.signingkey /home/vscode/.ssh/<ssh-key-name>.pub
git config --global commit.gpgsign true
```

You are good to go.
Run `ssh-add` if you want the container to remember the passphrase for your ssh key.
