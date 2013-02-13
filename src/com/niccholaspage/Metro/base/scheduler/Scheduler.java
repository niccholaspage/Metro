package com.niccholaspage.Metro.base.scheduler;

import com.niccholaspage.Metro.base.MetroPlugin;

public interface Scheduler {
    public void runTask(MetroPlugin plugin, Runnable task);
    
    public void runTaskAsynchronously(MetroPlugin plugin, Runnable task);
    
    public void runTaskLater(MetroPlugin plugin, Runnable task, long delay);

    public void runTaskLaterAsynchronously(MetroPlugin plugin, Runnable task, long delay);

    public void runTaskTimer(MetroPlugin plugin, Runnable task, long delay, long period);
}
